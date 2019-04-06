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
	}
public Student getLastStudent()
	{
}

	public Student getPreviousStudent()
	{
}

	public Student getNextStudent()
	{
public void updateStudent(Student studentData)
	{
}

	public void deleteStudent(Student studentData)
	{
}

	public void addNewStudent(Student studentData)
	{
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
