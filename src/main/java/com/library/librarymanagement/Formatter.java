/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.library.librarymanagement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author tatlo
 */
public class Formatter {
    public static LocalDate formatter(String strDate) {
        LocalDate date = LocalDate.parse(strDate, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        return date;
    }
}
