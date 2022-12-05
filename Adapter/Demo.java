package com.lab.AdapterImageEditor;

public class Demo {
    public static void main(String[] args) {
        DefaultEditor defaulteditor = new DefaultEditor();

        defaulteditor.edit("jpg", "jpg20");
        defaulteditor.edit("jpeg", "jpeg21");
        defaulteditor.edit("raw", "raw22");
        defaulteditor.edit("dng", "dng23");
    }
}