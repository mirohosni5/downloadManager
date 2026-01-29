package com.mirohosni.downloadManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DownloadManager implements Runnable{
    private int fileId;
    public DownloadManager(int fileId){
         this.fileId=fileId;
    }
    @Override
    public void run() {
for (int i=1;i<=5;i++){
    System.out.println("downloading "+i+" files");

}
        System.out.println("download completed");
    }

    public static  void main(String[] args) throws InterruptedException {
        Thread t=new Thread(new DownloadManager());
        t.start();
        t.join();
        System.out.println("downloading  finished");


}


}