import javax.swing.*;

import java.util.*;

import java.io.*;

import java.util.Scanner;

public class StaffPhone
{
public static void main(String[]args)
{
 try
 {
  FileReader readTextFile=new FileReader("staffphone.txt");

  Scanner fileReaderScan=new Scanner(readTextFile);

  String storeAllString="";

  while(fileReaderScan.hasNextLine())
  {
   String temp=fileReaderScan.nextLine()+"\n";

   storeAllString=storeAllString+temp;
  }

  JTextArea textArea=new JTextArea(storeAllString);

  textArea.setLineWrap(true);

  textArea.setWrapStyleWord(true);

  JScrollPane scrollBarForTextArea=new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

  JFrame frame=new JFrame("Staff Phones");

  frame.add(scrollBarForTextArea);

  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  frame.setSize(500,500);

  frame.setLocationRelativeTo(null);

  frame.setVisible(true);
 }
 catch(Exception exception)
 {
  System.out.println("Error in file processing");
 }
}
}