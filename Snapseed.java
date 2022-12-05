package com.lab.AdapterImageEditor;

public class Snapseed implements AdvanceImageEditor{
    @Override
    public void editDNG(String fileName)
    {
        System.out.println("Editing DNG file "+fileName);
    }
    @Override
    public void editRAW(String fileName)
    {
        //System.out.println("Editing Raw file "+fileName);
    }
}
