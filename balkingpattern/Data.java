package balkingpattern;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.attribute.DosFileAttributeView;

public class Data {
	private final String fileName;
	private String content;
	private boolean changed;

	public Data(String fileName, String content) {
		this.fileName = fileName;
		this.content = content;
		this.changed = true;
	}

	// 修改数据内容
	public synchronized void change(String newContent) {
		content = newContent;
		changed = true;
	}

	// 若数据有修改保存到文件中
	public synchronized void save() throws IOException {
		if (!changed) {
			return;
		}
		doSave();
		// 保存之后，置为false
		changed = false;
	}

	// 实际将数据保存到文件里的方法
	private void doSave() throws IOException {
		System.out.println(Thread.currentThread().getName() + " calls dosave, content = " + content);
		Writer writer = new FileWriter(fileName);
		writer.write(content);
		writer.close();
	}

}
