package sftp;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Vector;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class SFTPTest {

	public static Session session = null;

	public static void main(String[] args) throws JSchException, SftpException, IOException {
		
		SFTPData data = new SFTPData();
		data.setHostname("qtvuoxkwsspgg.eastus.azurecontainer.io");
		data.setUsername("SaudagarYadav");
		data.setPassword("Saudagar@1357$");
		data.setPort(22);
		data.setLocalFileLocation("C:\\Workspace\\Temp\\postingData.xml");
		data.setUploadFileLocation("/upload/test/");
		
		//ChannelSftp sftpConnection = getSftpConnection(data);
		//viewAllFile(data);
		uploadFile(data);
		// readFilecontent(data);
		// deleteFile(data);
	}

	private static ChannelSftp getSftpConnection(final SFTPData data) throws JSchException, SftpException, IOException {

		Properties config = new java.util.Properties();
		config.put("StrictHostKeyChecking", "no");

		JSch ssh = new JSch();
		session = ssh.getSession(data.getUsername(), data.getHostname(), data.getPort());
		session.setConfig(config);
		session.setPassword(data.getPassword());
		session.connect();

		ChannelSftp sftp = (ChannelSftp) session.openChannel("sftp");
		sftp.connect();

		return sftp;
	}

	public static void uploadFile(final SFTPData data)
			throws JSchException, SftpException, IOException {
		
		ChannelSftp channelSftp = getSftpConnection(data);
		channelSftp.put(data.getLocalFileLocation(), data.getUploadFileLocation() + "yse.xml");
		channelSftp.disconnect();
		session.disconnect();
	}

	private static void viewAllFile(SFTPData data) throws SftpException, JSchException, IOException {
		ChannelSftp channelSftp = getSftpConnection(data);
		channelSftp.cd(data.getUploadFileLocation());		
		Vector<ChannelSftp.LsEntry> list = channelSftp.ls("*.xml");
		for(ChannelSftp.LsEntry entry : list) {
			System.out.println(entry.getFilename()); 
		}
		channelSftp.disconnect();
		session.disconnect();
	}
	
	private static void readFilecontent(SFTPData data) throws SftpException, IOException, JSchException {
		ChannelSftp channelSftp = getSftpConnection(data);
		channelSftp.cd(data.getUploadFileLocation());
		InputStream stream = channelSftp.get("test.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(stream));
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		channelSftp.disconnect();
		session.disconnect();
	}
	
	private static void deleteFile(SFTPData data) throws JSchException, SftpException, IOException {
		ChannelSftp channelSftp = getSftpConnection(data);
		File file = new File(data.getUploadFileLocation() +"test.xml");
		file.delete();
		channelSftp.disconnect();
		session.disconnect();
		
	}
}
