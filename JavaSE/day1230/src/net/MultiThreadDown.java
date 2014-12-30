package net;

public class MultiThreadDown {
	public static void main(String[] args) throws Exception {
		//初始化DownUtile对象
		final DownUtil downUtil = new DownUtil("http://www.crazyit.org/"
		+"attachment.php?aid=MTYONXxjNjBiYzNjN3wxMzElNTQ2MjU5fGNhO"
				+ "DlKVmpXVmhpNGlkWmVzR2JZbnluZWpqSllOd3JzckdodXJOMUpOWWtOaTJz"
		, "oraclesql", 4);
		//开始下载
		downUtil.download();
		new Thread(){
			public void run() {
				while (downUtil.getCompleteRate()<1) {
					//每隔0.1秒查询一次任务的完成进度
					//GUI程序中可根据改进度来绘制进度条
					System.out.println("已完成：" + downUtil.getCompleteRate());
					try {
						Thread.sleep(1000);
					} catch (Exception ex) {
						// TODO: handle exception
					}
				}
			}
		}.start();
	}
}
