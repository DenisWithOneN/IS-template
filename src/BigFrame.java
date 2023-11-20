public class BigFrame extends PictureFrame {

    public BigFrame(String frameType) {
        super(frameType);
    }

    @Override
    public void openBackCover() {
        super.openBackCover();
    }

    @Override
    void cleanGlass() {
    }

    @Override
    void cutPicture() {
        System.out.println("no need to cut picture");

    }

    @Override
    public void putPicture() {

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
        return false;
    }
}
