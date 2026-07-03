class EmailNotifier implements NotificationChannel {
    public void send(String message){
        System.out.println("Email: " + message);
    }
}
