package org.example;

import org.example.model.Account;
import org.example.model.Address;

public class App 
{
    public static void main( String[] args )
    {
        Address address = new Address("Jl.Moh.Hatta","Pauh","Padang","Sumbar");
        Account account = new Account("annisa","annisa09","Annisa Dwi Febryanti","annisa@gmail.com","08657653659","09-02-2001","Bukittiggi",address);

        System.out.println("Username: " + account.getUsername());
        System.out.println("Password: " + account.getPassword());
        System.out.println("Full Name: " + account.getFullName());
        System.out.println("Email: " + account.getEmail());
        System.out.println("Phone Number: " + account.getPhoneNumber());
        System.out.println("Date of Birth: " + account.getDob());
        System.out.println("Place of Birth: " + account.getPob());
        System.out.println("Address: " + account.getAddress().getStreet() + ", " + account.getAddress().getDistrict() + ", " + account.getAddress().getCity() + ", " + account.getAddress().getProvince());

//      Mengubah Alamat User
        Address newAddress = new Address("Cimpago","Koto Marapak","Agam","Sumbar");
        account.setAddress(newAddress);

        System.out.println("New Address : " + account.getAddress().getStreet() + "," + account.getAddress().getDistrict() + "," + account.getAddress().getCity() + "," + account.getAddress().getProvince() );
    }
}
