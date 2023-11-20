public class OldSmallFrame extends PictureFrame {

    public OldSmallFrame(String frameType) {
        super(frameType);
    }

    @Override
    public void openBackCover() {
        super.openBackCover();
    }

    @Override
    void cleanGlass() {
        System.out.println("the " + getFrameType() + " was cleaned");

    }

    @Override
    void cutPicture() {
        System.out.println("picture was cut to fit " + getFrameType() + " frame");
    }

    @Override
    public void putPicture() {
        super.putPicture();
    }

    @Override
    public void closeBackCover() {
        super.closeBackCover();
    }

    @Override
    boolean wantToCleanGlass() {
        return true;
    }

    @Override
    boolean wantToCutPicture() {
        return true;
    }
}
