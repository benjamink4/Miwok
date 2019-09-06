package com.example.android.miwok;

public class Word {
    private String Miwok;
    private String English;
    private int audioResource;
    private int mImageResourceId=no_image;
    private static int no_image=-1;

    public Word(String English,String Miwok,int audioResource){
        this.Miwok=Miwok;
        this.English=English;
        this.audioResource=audioResource;
    }
    public Word(String English,String MiWok,int mImageResourceId,int audioResource ){
        this.Miwok=MiWok;
        this.English=English;
        this.mImageResourceId=mImageResourceId;
        this.audioResource=audioResource;
    }

    public String getEnglish() {
        return English;
    }
    public String getMiwok(){
        return Miwok;
    }
    public int getmImageResourceId(){return mImageResourceId;}
    public int getAudioResource(){return audioResource;}
    public boolean hasImage(){
        if(mImageResourceId==no_image){
            return false;
        }
        return true;

    }

}
