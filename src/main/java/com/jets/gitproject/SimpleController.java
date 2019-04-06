package com.jets.gitproject;

public class SimpleController extends Application {
	//Mai work


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

}
