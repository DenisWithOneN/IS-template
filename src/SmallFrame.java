public class SmallFrame extends PictureFrame {
    public SmallFrame(String frameType) {
        super(frameType);
    }

    @Override
    public void openBackCover() {
        super.openBackCover();
    }

    @Override
    void cleanGlass() {
        System.out.println("glass is crystal clear");
    }

    @Override
    void cutPicture() {
        System.out.println("picture was cut to fit the " + getFrameType() + " frame");

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
        return super.wantToCleanGlass();
    }

    @Override
    boolean wantToCutPicture() {
        return true;
    }
}
