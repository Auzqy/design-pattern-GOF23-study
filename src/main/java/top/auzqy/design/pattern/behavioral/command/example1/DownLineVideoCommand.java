package top.auzqy.design.pattern.behavioral.command.example1;

public class DownLineVideoCommand implements Command {

    private Video video;

    public DownLineVideoCommand(Video video) {
        this.video = video;
    }

    @Override
    public void execute() {
        video.downLine();
    }
}
