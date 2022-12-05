package com.lab.AdapterImageEditor;

public class ImageAdapter implements ImageEditor{
    AdvanceImageEditor advanceImagEditor;

    public ImageAdapter(String imageType)
    {
        if(imageType.equalsIgnoreCase("dng"))
        {
            advanceImagEditor = new Snapseed();
        }
        else if(imageType.equalsIgnoreCase("raw"))
        {
            advanceImagEditor = new Lightroom();
        }
    }
    @Override
    public void edit(String imageType, String fileName)
    {
        if(imageType.equalsIgnoreCase("dng"))
        {
            advanceImagEditor.editDNG(fileName);
        }
        else if(imageType.equalsIgnoreCase("raw"))
        {
            advanceImagEditor.editRAW(fileName);
        }
    }
}
