package Playgrounds;

public class NotificationService {
	
	private sendable sender;
	
//	NotificationService(sendable sender){
//		this.sender = sender;
//	}

	void sendNotification() {
		sender.send();
	}
}
