package com.mirohosni.downloadManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DownloadManager implements Runnable{
    @Override
    public void run() {
for (int i=1;i<=5;i++){
    
}
    }

    public static  void main(String[] args) {
        Thread t=new Thread(new DownloadManager());
        t.start();
        t.join();

}


}