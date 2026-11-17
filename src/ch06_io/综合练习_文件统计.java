import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 综合练习_文件统计 {
    public static void main(String[] args) {
        File f = new File("/home/jsb123/java-learning/test");

        HashMap<String, Integer> result = new HashMap<>();
        result.put(".txt", 0);
        result.put(".doc", 0);
        result.put(".jpg", 0);

        Set<HashMap.Entry<String, Integer>> entries = result.entrySet();
        toPacket(f, result);
        entries.forEach((entry) -> System.out.println(entry.getKey() + ":" + entry.getValue()));
    }

    public static void toPacket(File f, Map<String, Integer> result) {
        File[] files = f.listFiles();
        if (files == null) return;
        for (File file : files) {
            if (file.isFile()) {
                String name = file.getName(); // 只取一次
                int dot = name.lastIndexOf('.');
                if (dot > 0) {
                    String ext = name.substring(dot);
                    // 只处理关心的扩展名
                    if (result.containsKey(ext)) {
                        result.merge(ext, 1, Integer::sum);
                    }
                }
            } else {
                toPacket(file, result);
            }
        }
    }
}

