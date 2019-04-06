package com.jets.gitproject;

public class SimpleUI extends BorderPane {

     // Mai work
	protected final GridPane gridPane;
	protected final ColumnConstraints columnConstraints;
	protected final ColumnConstraints columnConstraints0;
	protected final RowConstraints rowConstraints;
	protected final RowConstraints rowConstraints0;
	protected final RowConstraints rowConstraints1;
	protected final RowConstraints rowConstraints2;
	protected final RowConstraints rowConstraints3;
	protected final RowConstraints rowConstraints4;
	protected final Label label;
	protected final Label label0;
	protected final Label label1;
	protected final Label label2;
	protected final Label label3;
	protected final Label label4;

	// TextFields & Button
	protected final TextField t_ID;
	protected final TextField t_Phone;
	protected final TextField t_Email;
	protected final TextField t_LN;
	protected final TextField t_MN;
	protected final TextField t_FN;
	protected final FlowPane flowPane;
	protected final Button b_new;
	protected final Button b_update;
	protected final Button b_delete;
	protected final Button b_first;
	protected final Button b_prev;
	protected final Button b_next;
	protected final Button b_last;
	protected final StackPane stackPane;
	protected final Label label5;

	// Controller
	SimpleController controller;

	public SimpleUI(SimpleController controller)
	{
		this.controller = controller;

		gridPane = new GridPane();
		columnConstraints = new ColumnConstraints();
		columnConstraints0 = new ColumnConstraints();
		rowConstraints = new RowConstraints();
		rowConstraints0 = new RowConstraints();
		rowConstraints1 = new RowConstraints();
		rowConstraints2 = new RowConstraints();
		rowConstraints3 = new RowConstraints();
		rowConstraints4 = new RowConstraints();
		label = new Label();
		label0 = new Label();
		label1 = new Label();
		label2 = new Label();
		label3 = new Label();
		label4 = new Label();
		t_ID = new TextField();
		t_Phone = new TextField();
		t_Email = new TextField();
		t_LN = new TextField();
		t_MN = new TextField();
		t_FN = new TextField();
		flowPane = new FlowPane();
		b_new = new Button();
		b_update = new Button();
		b_delete = new Button();
		b_first = new Button();
		b_prev = new Button();
		b_next = new Button();
		b_last = new Button();
		stackPane = new StackPane();
		label5 = new Label();

		setMaxHeight(USE_PREF_SIZE);
		setMaxWidth(USE_PREF_SIZE);
		setMinHeight(USE_PREF_SIZE);
		setMinWidth(USE_PREF_SIZE);
		setPrefHeight(400.0);
		setPrefWidth(601.0);

		BorderPane.setAlignment(gridPane, javafx.geometry.Pos.CENTER);
		gridPane.setAlignment(javafx.geometry.Pos.CENTER);
		gridPane.setPrefHeight(312.0);
		gridPane.setPrefWidth(560.0);

		columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
		columnConstraints.setMaxWidth(293.0);
		columnConstraints.setMinWidth(10.0);
		columnConstraints.setPrefWidth(150.0);

		columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
		columnConstraints0.setMaxWidth(414.0);
		columnConstraints0.setMinWidth(10.0);
		columnConstraints0.setPrefWidth(307.0);

		rowConstraints.setMinHeight(10.0);
		rowConstraints.setPrefHeight(30.0);
		rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

		rowConstraints0.setMinHeight(10.0);
		rowConstraints0.setPrefHeight(30.0);
		rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

		rowConstraints1.setMinHeight(10.0);
		rowConstraints1.setPrefHeight(30.0);
		rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

		rowConstraints2.setMinHeight(10.0);
		rowConstraints2.setPrefHeight(30.0);
		rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

		rowConstraints3.setMinHeight(10.0);
		rowConstraints3.setPrefHeight(30.0);
		rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

		rowConstraints4.setMinHeight(10.0);
		rowConstraints4.setPrefHeight(30.0);
		rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

		GridPane.setHalignment(label, javafx.geometry.HPos.LEFT);
		GridPane.setValignment(label, javafx.geometry.VPos.CENTER);
		label.setAlignment(javafx.geometry.Pos.CENTER);
		label.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
		label.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
		label.setText("ID");
		label.setFont(new Font("System Bold", 19.0));

		GridPane.setHalignment(label0, javafx.geometry.HPos.LEFT);
		GridPane.setRowIndex(label0, 1);
		label0.setAlignment(javafx.geometry.Pos.CENTER);
		label0.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
		label0.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
		label0.setText("FirstName");
		label0.setFont(new Font("System Bold", 19.0));

		GridPane.setHalignment(label1, javafx.geometry.HPos.LEFT);
		GridPane.setRowIndex(label1, 3);
		label1.setAlignment(javafx.geometry.Pos.CENTER);
		label1.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
		label1.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
		label1.setText("LastName");
		label1.setFont(new Font("System Bold", 19.0));

		GridPane.setHalignment(label2, javafx.geometry.HPos.LEFT);
		GridPane.setRowIndex(label2, 2);
		label2.setAlignment(javafx.geometry.Pos.CENTER);
		label2.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
		label2.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
		label2.setText("MiddleName");
		label2.setFont(new Font("System Bold", 19.0));

		GridPane.setHalignment(label3, javafx.geometry.HPos.LEFT);
		GridPane.setRowIndex(label3, 4);
		label3.setAlignment(javafx.geometry.Pos.CENTER);
		label3.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
		label3.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
		label3.setText("Email");
		label3.setFont(new Font("System Bold", 19.0));

		GridPane.setHalignment(label4, javafx.geometry.HPos.LEFT);
		GridPane.setRowIndex(label4, 5);
		label4.setAlignment(javafx.geometry.Pos.CENTER);
		label4.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
		label4.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
		label4.setText("Phone");
		label4.setFont(new Font("System Bold", 19.0));

		GridPane.setColumnIndex(t_ID, 1);
		t_ID.setAlignment(javafx.geometry.Pos.CENTER);
		t_ID.setMaxWidth(200.0);
		t_ID.setPromptText("Enter Input here");

		GridPane.setColumnIndex(t_Phone, 1);
		GridPane.setRowIndex(t_Phone, 5);
		t_Phone.setAlignment(javafx.geometry.Pos.CENTER);
		t_Phone.setLayoutX(196.0);
		t_Phone.setLayoutY(24.0);
		t_Phone.setMaxWidth(200.0);
		t_Phone.setPromptText("Enter Input here");

		GridPane.setColumnIndex(t_Email, 1);
		GridPane.setRowIndex(t_Email, 4);
		t_Email.setAlignment(javafx.geometry.Pos.CENTER);
		t_Email.setLayoutX(10.0);
		t_Email.setLayoutY(24.0);
		t_Email.setMaxWidth(200.0);
		t_Email.setPromptText("Enter Input here");

		GridPane.setColumnIndex(t_LN, 1);
		GridPane.setRowIndex(t_LN, 3);
		t_LN.setAlignment(javafx.geometry.Pos.CENTER);
		t_LN.setLayoutX(10.0);
		t_LN.setLayoutY(24.0);
		t_LN.setMaxWidth(200.0);
		t_LN.setPromptText("Enter Input here");

		GridPane.setColumnIndex(t_MN, 1);
		GridPane.setRowIndex(t_MN, 2);
		t_MN.setAlignment(javafx.geometry.Pos.CENTER);
		t_MN.setLayoutX(10.0);
		t_MN.setLayoutY(24.0);
		t_MN.setMaxWidth(200.0);
		t_MN.setPromptText("Enter Input here");

		GridPane.setColumnIndex(t_FN, 1);
		GridPane.setRowIndex(t_FN, 1);
		t_FN.setAlignment(javafx.geometry.Pos.CENTER);
		t_FN.setLayoutX(10.0);
		t_FN.setLayoutY(24.0);
		t_FN.setMaxWidth(200.0);
		t_FN.setPromptText("Enter Input here");
		setCenter(gridPane);

		BorderPane.setAlignment(flowPane, javafx.geometry.Pos.CENTER);
		flowPane.setAlignment(javafx.geometry.Pos.CENTER);
		flowPane.setHgap(10.0);
		flowPane.setPrefHeight(88.0);
		flowPane.setPrefWidth(600.0);
		flowPane.setStyle("-fx-background-color: gray;");

		b_new.setMnemonicParsing(false);
		b_new.setText("New ..");

		b_update.setLayoutX(10.0);
		b_update.setLayoutY(10.0);
		b_update.setMnemonicParsing(false);
		b_update.setText("Update");

		b_delete.setLayoutX(62.0);
		b_delete.setLayoutY(10.0);
		b_delete.setMnemonicParsing(false);
		b_delete.setText("Delete");

		b_first.setLayoutX(114.0);
		b_first.setLayoutY(10.0);
		b_first.setMnemonicParsing(false);
		b_first.setText("First");

		b_prev.setLayoutX(114.0);
		b_prev.setLayoutY(10.0);
		b_prev.setMnemonicParsing(false);
		b_prev.setText("Previous");

		b_next.setLayoutX(166.0);
		b_next.setLayoutY(10.0);
		b_next.setMnemonicParsing(false);
		b_next.setText("Next");

		b_last.setLayoutX(218.0);
		b_last.setLayoutY(10.0);
		b_last.setMnemonicParsing(false);
		b_last.setText("Last");
		setBottom(flowPane);

		BorderPane.setAlignment(stackPane, javafx.geometry.Pos.CENTER);
		stackPane.setPrefHeight(312.0);
		stackPane.setPrefWidth(116.0);

		StackPane.setAlignment(label5, javafx.geometry.Pos.CENTER);
		label5.setMaxWidth(Double.MAX_VALUE);
		label5.setMinHeight(USE_PREF_SIZE);
		label5.setMinWidth(USE_PREF_SIZE);
		label5.setRotate(-90.0);
		label5.setText("Person Details");
		label5.setTextFill(javafx.scene.paint.Color.valueOf("#eb0000"));
		label5.setUnderline(true);
		label5.setFont(new Font(22.0));
		setLeft(stackPane);

		gridPane.getColumnConstraints().add(columnConstraints);
		gridPane.getColumnConstraints().add(columnConstraints0);
		gridPane.getRowConstraints().add(rowConstraints);
		gridPane.getRowConstraints().add(rowConstraints0);
		gridPane.getRowConstraints().add(rowConstraints1);
		gridPane.getRowConstraints().add(rowConstraints2);
		gridPane.getRowConstraints().add(rowConstraints3);
		gridPane.getRowConstraints().add(rowConstraints4);
		gridPane.getChildren().add(label);
		gridPane.getChildren().add(label0);
		gridPane.getChildren().add(label1);
		gridPane.getChildren().add(label2);
		gridPane.getChildren().add(label3);
		gridPane.getChildren().add(label4);
		gridPane.getChildren().add(t_ID);
		gridPane.getChildren().add(t_Phone);
		gridPane.getChildren().add(t_Email);
		gridPane.getChildren().add(t_LN);
		gridPane.getChildren().add(t_MN);
		gridPane.getChildren().add(t_FN);
		flowPane.getChildren().add(b_new);
		flowPane.getChildren().add(b_update);
		flowPane.getChildren().add(b_delete);
		flowPane.getChildren().add(b_first);
		flowPane.getChildren().add(b_prev);
		flowPane.getChildren().add(b_next);
		flowPane.getChildren().add(b_last);
		stackPane.getChildren().add(label5);

	}



     // Elhosany work
	//Write to UI
	private void updateUI(Student student)
	{
		t_ID.setText(String.valueOf(student.getId()));
		t_Phone.setText(student.getPhone());
		t_FN.setText(student.getFirstName());
		t_MN.setText(student.getMiddleName());
		t_LN.setText(student.getLastName());
		t_Email.setText(student.getEmail());
	}
	
	//Read from UI
	private Student getStudentData() 
	{
		Student student = new Student();
		try {
			int id = Integer.parseInt(t_ID.getText());
			student.setId(id);
			student.setEmail(t_Email.getText());
			student.setFirstName(t_FN.getText());
			student.setLastName(t_LN.getText());
			student.setMiddleName(t_MN.getText());
			student.setPhone(t_Phone.getText());
		}catch (NumberFormatException e) {
			System.out.println("ID is invalid !");
		}
		
		return student;
	}
	
	//User actions
	public void initEvents()
	{
	}
}
