/*
* Copyright (c) 2015 Dmitrii Shamrikov
* Copyright (c) 2021 Ganesha Ajjampura
* 
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
* SOFTWARE.
*/

package test;

import java.io.IOException;

import com.github.suncloudsmoon.tilegame2d.mslinks.ShellLink;

public class Main {
	public static void main(String[] args) throws IOException {
//		ShellLink sl = ShellLink.createLink("pause.bat")
//			.setWorkingDir("..")
//			.setIconLocation("%SystemRoot%\\system32\\SHELL32.dll");
//		
////		sl.getHeader().setIconIndex(128);
////		sl.getConsoleData()
////			.setFont(com.github.suncloudsmoon.mslinks.extra.ConsoleData.Font.Consolas)
////			.setFontSize(24)
////			.setTextColor(5);
//				
//		sl.saveTo("testlink.lnk");
//		System.out.println(sl.getWorkingDir());
//		System.out.println(sl.resolveTarget());
		
		// ShellLink.createLink("‪C:\\Users\\super\\Desktop\\Remember this.txt", "C:\\Users\\super\\Desktop\\HelloWorld.Ink");
		// .setIconLocation("‪C:\\Users\\super\\Desktop\\favicon.ico");
		ShellLink s = ShellLink.createLink("C:\\Users\\super\\Desktop\\Lol.txt");
		// s.setWorkingDir("..");
		s.setIconLocation("C:\\Users\\super\\Desktop\\favicon.ico");
		s.saveTo("C:\\Users\\super\\Desktop\\HelloWorld.lnk");
	}
}
