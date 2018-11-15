public class PaintingApplication {
    public static void main(String[] args) {
        Tool tool = new Tool ("hammer");
        Derek derek = new Derek(tool);
        derek.hangPainting();
        derek.setTool(tool);
    }
}
