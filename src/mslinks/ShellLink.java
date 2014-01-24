package mslinks;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ShellLink {
	
	private ShellLinkHeader header; 
	
	public ShellLink(String file) throws IOException, ShellLinkException {
		this(Paths.get(file));
	}
	
	public ShellLink(File file) throws IOException, ShellLinkException {
		this(file.toPath());
	}
	
	public ShellLink(Path file) throws IOException, ShellLinkException {
		this(Files.newInputStream(file));
	}
	
	public ShellLink(InputStream in) throws IOException, ShellLinkException {
		this(new ByteReader(in));
	}
	
	private ShellLink(ByteReader data) throws ShellLinkException, IOException {
		header = new ShellLinkHeader(data);
	}
	
	public void serialize(OutputStream out) throws IOException {
		serialize(out, true);
	}
	
	public void serialize(OutputStream out, boolean littleendian) throws IOException {
		ByteWriter bw = new ByteWriter(out);
		if (littleendian) bw.setLittleEndian();
		else bw.setBigEndian();
		header.serialize(bw);		
	}
	
	/*    to header      */
	public LinkFlags getLinkFlags() { return header.getLinkFlags(); }
	public FileAttributesFlags getFileAttributesFlags() { return header.getFileAttributesFlags(); }
	public Filetime getCreationTime() { return header.getCreationTime(); }
	public Filetime getAccessTime() { return header.getAccessTime(); }
	public Filetime getWriteTime() { return header.getWriteTime(); }
	public HotKeyFlags getHotKeyFlags() { return header.getHotKeyFlags(); }
	
	public int getFileSize() { return header.getFileSize(); }
	public void setFileSize(long n) { header.setFileSize(n); }
	
	public int getIconIndex() { return header.getIconIndex(); }
	public void setIconIndex(int n) { header.setIconIndex(n); }
	
	public int getShowCommand() { return header.getShowCommand(); }
	public void setShowCommand(int n) throws ShellLinkException { header.setShowCommand(n); }
}