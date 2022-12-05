package com.lab.AdapterImageEditor;

public class Lightroom implements AdvanceImageEditor{
    @Override
    public void editRAW(String fileName)
    {
        System.out.println("Editing RAW file "+fileName);
    }
    @Override
    public void editDNG(String fileName)
    {
        //System.out.println();
    }
}
