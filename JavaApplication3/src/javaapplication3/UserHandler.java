/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class UserHandler extends DefaultHandler {

   boolean FirstName = false;
   boolean LastName = false;
   boolean dob = false;
   

   @Override
   public void startElement(String uri, 
   String localName, String qName, Attributes attributes) throws SAXException {

      if (qName.equalsIgnoreCase("person")) {
         System.out.println("Start Element: person");
      } else if (qName.equalsIgnoreCase("firstname")) {
         FirstName = true;
      } else if (qName.equalsIgnoreCase("lastname")) {
         LastName = true;
      } else if (qName.equalsIgnoreCase("dateofbirth")) {
         dob = true;
      }
   }

   @Override
   public void endElement(String uri, 
   String localName, String qName) throws SAXException {
      if (qName.equalsIgnoreCase("person")) {
         System.out.println("End Element :" + qName);
      }
   }

   @Override
   public void characters(char ch[], int start, int length) throws SAXException {
      
      if (FirstName) {
         System.out.println("First Name: " 
            + new String(ch, start, length));
         FirstName = false;
      } else if (LastName) {
         System.out.println("Last Name: " + new String(ch, start, length));
         LastName = false;
      } else if (dob) {
         System.out.println("Date of birth: " + new String(ch, start, length));
         dob = false;
      } 
   }
}