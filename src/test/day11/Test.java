package test.day11;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @program: test02
 * @description:
 * @author: yj
 * @create: 2021-02-03 15:28
 **/
public class Test {
    public static List<File> videoIntercept(File file, Integer start, Integer end) {
        Frame frame = null;
        List<File> files = Lists.newArrayList();
        FFmpegFrameGrabber fFmpegFrameGrabber = new FFmpegFrameGrabber(file);
        String filePath = "D://video//images//";
        String fileTargetName = "movie";
        try {
            fFmpegFrameGrabber.start();
            int ftp = fFmpegFrameGrabber.getLengthInFrames();
            System.out.println("开始视频提取帧");
            for (int i=0 ; i < ftp ; i++){
                if( i >= start && i <= end){
                    frame = fFmpegFrameGrabber.grabImage();
                    doExecuteFrame(frame, filePath, fileTargetName, i ,files);
                }
            }
            System.out.println("============运行结束============");
            fFmpegFrameGrabber.stop();
        } catch (IOException E) {
// Loggers.ERROR.error("视频抽帧异常", e);
        }
        return files;
    }

    public static void doExecuteFrame(Frame frame, String targetFilePath, String targetFileName, int index ,List<File> files) {
        if ( frame == null || frame.image == null) {
            return;
        }
        Java2DFrameConverter converter = new Java2DFrameConverter();
        String imageMat = "jpg";
        String fileName = targetFilePath + targetFileName + "_" + index + "." + imageMat;
        BufferedImage bi = converter.getBufferedImage(frame);
        File output = new File(fileName);
        files.add(output);
        try{
            ImageIO.write(bi, imageMat, output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<File> files = videoIntercept(new File("D://video//1553583033205-480p.mp4"), 10, 20);
        System.out.println(files);
    }

}
