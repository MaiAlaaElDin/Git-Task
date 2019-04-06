package com.jets.gitproject;

public class SimpleController extends Application {
	//Mai work
	private SimpleUI view;
	private DataSource dataSource;
	private ResultSet resultSet = null;

	public SimpleController()
	{
		view = new SimpleUI(this);
		// get datasource of mysql driver using properties file
		dataSource = getMySQLDataSource();
		// get result set of students table
		resultSet = getDBData(dataSource);
	}

	//Elhosany work
	// Connection & fetching resultset
	private DataSource getMySQLDataSource()
	{
		Properties properties = new Properties();
		MysqlDataSource mysqlDS = null;

		try (FileInputStream inputStream = new FileInputStream("db.properties")) {
			// read properties file
			properties.load(inputStream);
			// create mysql datasource
			mysqlDS = new MysqlDataSource();
			// setting datasource with properties values
			mysqlDS.setURL(properties.getProperty("MYSQL_DB_URL"));
			mysqlDS.setUser(properties.getProperty("MYSQL_DB_USERNAME"));
			mysqlDS.setPassword(properties.getProperty("MYSQL_DB_PASSWORD"));

		} catch (IOException e) {
			System.out.println("Error while loading properties file !");
		}

		return mysqlDS;
	}

	private ResultSet getDBData(DataSource dataSource)
	{
		ResultSet resultSet = null;
		try {
			Connection connection = dataSource.getConnection();
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);

			// read data from employee table
			resultSet = statement.executeQuery("SELECT * FROM student");

		} catch (SQLException e) {
			System.out.println("Error while retrieving data from db !");
		}
		return resultSet;
	}
	// User methods
	public Student getFirstStudent()
	{
		Student newStudent = null;
		try {
			// move to first record
			if (resultSet.first()) {
				newStudent = new Student();
				newStudent.setId(resultSet.getInt(1));
				newStudent.setFirstName(resultSet.getString(2));
				newStudent.setMiddleName(resultSet.getString(3));
				newStudent.setLastName(resultSet.getString(4));
				newStudent.setEmail(resultSet.getString(5));
				newStudent.setPhone(resultSet.getString(6));
			}
		} catch (SQLException e) {
			System.out.println("Failed to get first element : " + e.getMessage());
		}

		return newStudent;
	}
	public Student getLastStudent()
	{
		Student newStudent = null;
		try {
			// move to first record
			if (resultSet.last()) {
				newStudent = new Student();
				newStudent.setId(resultSet.getInt(1));
				newStudent.setFirstName(resultSet.getString(2));
				newStudent.setMiddleName(resultSet.getString(3));
				newStudent.setLastName(resultSet.getString(4));
				newStudent.setEmail(resultSet.getString(5));
				newStudent.setPhone(resultSet.getString(6));
			}
		} catch (SQLException e) {
			System.out.println("Failed to get first element : " + e.getMessage());
		}

		return newStudent;
	}
	public Student getPreviousStudent()
	{
		Student newStudent = null;
		try {
			// move to first record
			if (resultSet.previous()) {
				newStudent = new Student();
				newStudent.setId(resultSet.getInt(1));
				newStudent.setFirstName(resultSet.getString(2));
				newStudent.setMiddleName(resultSet.getString(3));
				newStudent.setLastName(resultSet.getString(4));
				newStudent.setEmail(resultSet.getString(5));
				newStudent.setPhone(resultSet.getString(6));
			}
		} catch (SQLException e) {
			System.out.println("Failed to get first element : " + e.getMessage());
		}

		return newStudent;
	}

	public Student getNextStudent()
	{
		Student newStudent = null;
		try {
			// move to first record
			if (resultSet.next()) {
				newStudent = new Student();
				newStudent.setId(resultSet.getInt(1));
				newStudent.setFirstName(resultSet.getString(2));
				newStudent.setMiddleName(resultSet.getString(3));
				newStudent.setLastName(resultSet.getString(4));
				newStudent.setEmail(resultSet.getString(5));
				newStudent.setPhone(resultSet.getString(6));
			}
		} catch (SQLException e) {
			System.out.println("Failed to get first element : " + e.getMessage());
		}

		return newStudent;
	}

	public void updateStudent(Student studentData)
	{
		try {
			resultSet.updateInt(1, studentData.getId());
			resultSet.updateString(2, studentData.getFirstName());
			resultSet.updateString(3, studentData.getMiddleName());
			resultSet.updateString(4, studentData.getLastName());
			resultSet.updateString(5, studentData.getEmail());
			resultSet.updateString(6, studentData.getPhone());

			// must call update row to reflect update to database
			resultSet.updateRow();

		} catch (Exception e) {
			System.out.println("Failed to update student the reason is : " + e.getMessage());
		}
	}

	public void deleteStudent(Student studentData)
	{
		try {
			// delete cursor current row
			resultSet.deleteRow();
		} catch (SQLException e) {
			System.out.println("Failed to delete current row : " + e.getMessage());
		}
	}

	public void addNewStudent(Student studentData)
	{
		try {
			// first move to new row
			resultSet.moveToInsertRow();
			// gathering info from user and update columns of new row
			resultSet.updateInt(1, studentData.getId());
			resultSet.updateString(2, studentData.getFirstName());
			resultSet.updateString(3, studentData.getMiddleName());
			resultSet.updateString(4, studentData.getLastName());
			resultSet.updateString(5, studentData.getEmail());
			resultSet.updateString(6, studentData.getPhone());
			// invoke insertRow to make changes to resultset and database
			resultSet.insertRow();
		} catch (Exception e) {
			System.out.println("Failed to insert new row : " + e.getMessage());
		}
	}


	// FX lifecycle
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Scene scene = new Scene(view);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Lab 2 : Testing updatable result set with DataSource connection");
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception
	{
		resultSet.close();
		super.stop();
	}

	public static void main(String[] args)
	{
		launch(args);
	}

}
