import java.util.*;

class NotificationService {
    private List<NotificationChannel> channels = new ArrayList<>();

    public void addChannel(NotificationChannel channel){
        channels.add(channel);
    }

    public void notifyAllChannels(String message){
        for(NotificationChannel c : channels){
            c.send(message);
        }
    }
}
