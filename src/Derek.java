public class Derek {
    private Tool tool;

    public Derek(Tool tool) {
        this.tool = tool;
    }
    public Boolean canHangPainting() {
        return  (tool != null && tool.getToolName().equalsIgnoreCase("hammer"));
    }
    public void hangPainting() {
        if (canHangPainting()) {
            System.out.print("Derek can hang the painting.");
        } else {
            System.out.print("Derek is missing the hammer!");

        }
    }
    public void setTool(Tool tool) {
        this.tool = tool;
    }
}