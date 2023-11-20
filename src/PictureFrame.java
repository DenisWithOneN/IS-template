public abstract class PictureFrame {

    private String frameType;

    public PictureFrame(String frameType) {
        this.frameType = frameType;
    }
    //template method used to define the steps of algorithm
    final void asamblePictureFrame(String frameType) {
        openBackCover();

        if(wantToCleanGlass()) {
            cleanGlass();
        }
        if(wantToCutPicture()) {
            cutPicture();
        }
        putPicture();
        closeBackCover();
    }

    // steps of algorithm as abstract methods
    public void openBackCover() {
        System.out.println("Back cover of " + frameType + " picture frame opened");
    }
    abstract void cleanGlass();
    abstract void cutPicture();
    public void putPicture() {
        System.out.println("Picture placed inside the frame");
    }
    public void closeBackCover() {
        System.out.println("Back cover of " + frameType + " picture frame closed");
    }

    boolean wantToCleanGlass() {
        return false;
    }

    boolean wantToCutPicture() {
        return false;
    }

    public String getFrameType() {
        return frameType;
    }
}
