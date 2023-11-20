public class Main {
    public static void main(String[] args) {

        PictureFrame smallFrame = new SmallFrame("small");
        smallFrame.asamblePictureFrame("small");

        System.out.println("=====================================");

        PictureFrame oldSmallFrame = new OldSmallFrame("old small");
        oldSmallFrame.asamblePictureFrame("old small");

        System.out.println("=====================================");

        PictureFrame bigFrame = new BigFrame("big");
        bigFrame.asamblePictureFrame("big");
    }
}