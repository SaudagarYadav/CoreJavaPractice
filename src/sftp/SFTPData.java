package sftp;

public class SFTPData {

	private String hostname;
	private String username;
	private String password;
	private int port;
	private String uploadFileLocation;
	private String localFileLocation;

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int i) {
		this.port = i;
	}

	public String getUploadFileLocation() {
		return uploadFileLocation;
	}

	public void setUploadFileLocation(String uploadFileLocation) {
		this.uploadFileLocation = uploadFileLocation;
	}

	public String getLocalFileLocation() {
		return localFileLocation;
	}

	public void setLocalFileLocation(String localFileLocation) {
		this.localFileLocation = localFileLocation;
	}

}
