//Name: Richard John
//Instructor: Professor Richard Thomas Weir
//Course: CSC 330
//Assignment: GUIs
//Date: May 5, 2021

//Our imports
package sample;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.io.*;

public class Main extends Application {

    //private data members
    private VBox root;
    private Label encrypter, decrypter, input, output, messageLabel;
    private TextField inputMessageField, outputMessageField, inputFileField, outputFileField;
    private Button encryptButton, decryptButton;

    @Override
    public void start(Stage primaryStage) throws Exception{

        //Defining out\r Labels.
        output = new Label("Output File: ");
        input = new Label("Input File: ");
        encrypter = new Label("Message to Encrypt: ");
        decrypter = new Label("Decrypted Message: ");
        messageLabel = new Label("This message will change based on what you have done.");

        //Defining our Text Fields.
        outputFileField = new TextField();
        inputFileField = new TextField();
        outputMessageField = new TextField();
        inputMessageField = new TextField();

        //Defining our Buttons for both Encrypt and Decrypt.
        encryptButton = new Button("Encrypt");
        decryptButton = new Button("Decrypt");

        //Defining our HBoxes
        HBox bOne = new HBox(10);
        HBox bTwo = new HBox(14);

        //Hbox one will have the components for both output file and the Encrypt button.
        bOne.setAlignment(Pos.TOP_CENTER);
        bOne.getChildren().addAll(output, outputFileField, encrypter, outputMessageField, encryptButton);

        //Hbox two will have the components for both the input file and the Decrypt button.
        bTwo.setAlignment(Pos.TOP_CENTER);
        bTwo.getChildren().addAll(input, inputFileField, decrypter, inputMessageField, decryptButton);

        //We define our VBox and put out two HBoxes inside it.
        root = new VBox(12);
        root.setAlignment(Pos.CENTER_LEFT);
        root.getChildren().addAll(bOne, bTwo, messageLabel);

        //Event Handler for Encrypt button.
        EventHandler<ActionEvent> encrypt = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                //encrypt
                String en = "";
                String s = inputMessageField.getText();  //get the Text from the field
                for (int i = 0; i < s.length(); i++) {    //go through each char
                    char c = s.charAt(i);
                    int shifted = (int) c + 10;            //shift 10 places
                    en += (char) shifted;                    //turn back into char and add to String
                }
                //write this to a file
                try {
                    //Get the file output
                    String outputLoc = outputFileField.getText();   //get File name
                    DataOutputStream output = new DataOutputStream(new FileOutputStream(outputLoc)); //create the File
                    output.writeUTF(en);        //write String to file
                    output.close();                //close file
                    messageLabel.setText("Encrypted the message to " + outputLoc);    //show message in label
                } catch (Exception e) {
                    messageLabel.setText("An error has occurred when saving to the file!");
                } //error message
            }
        };

        //Event Handler for Decrypt button.
        EventHandler<ActionEvent> decrypt = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                //decrypt
                String de = "";			//String to return
                String jumbled = "";	//The jumbled file
                try {
                    DataInputStream input = new DataInputStream(new FileInputStream(inputFileField.getText()));   //read in the file
                    jumbled = input.readUTF();		//grab the String
                    input.close();					//close the file
                } catch (Exception e) { messageLabel.setText("Something terrible has happened when reading file."); }  //error message
                for(int i = 0; i < jumbled.length(); i++) {   //go through all the characters
                    char c = jumbled.charAt(i);
                    int shifted = (int)c - 10;			//deshift it
                    de+=(char)shifted;
                }
                outputMessageField.setText(de);    //show the decrypted message
                messageLabel.setText("Successfully decrypted the message!");   //show message
            }
        };

        //Setting onClick or onActions for our Encrypt and Decrypt Buttons.
        encryptButton.setOnAction(encrypt);
        decryptButton.setOnAction(decrypt);

        //Setting our stage's title, scene and we show it off.
        primaryStage.setTitle("Encrypt and Decrypt a File!");
        primaryStage.setScene(new Scene(root, 700, 200));
        primaryStage.show();
    }

    //All systems are go. JavaFX Application LAUNCH!!!
    public static void main(String[] args) {
        launch(args);
    }
}
