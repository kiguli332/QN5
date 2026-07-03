class SmsNotifier implements NotificationChannel {
    public void send(String message){
        System.out.println("SMS: " + message);
    }
}
