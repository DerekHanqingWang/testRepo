package tcpDownload;

import java.net.*;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.io.*;

public class TCPBasicDownload {
	 public static void main(String[] args) throws IOException {
		 Path path = Paths.get("C:\\workspaces\\data\\input");
		 System.out.print(path.resolve("xanadu.txt"));
		 
	 
	 }

}
