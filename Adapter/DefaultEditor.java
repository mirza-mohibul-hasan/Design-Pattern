package com.lab.AdapterImageEditor;

public class DefaultEditor implements ImageEditor{
    ImageAdapter  imageAdapter;
    @Override
    public void edit(String imageType, String fileName)
    {
        if(imageType.equalsIgnoreCase("jpg")|| imageType.equalsIgnoreCase("jpeg"))
        {
            System.out.println("Editing jpeg/jpg file "+fileName);
        }
        else if(imageType.equalsIgnoreCase("raw") || imageType.equalsIgnoreCase("dng"))
        {
            imageAdapter = new ImageAdapter(imageType);
            imageAdapter.edit(imageType, fileName);
        }
    }
}
