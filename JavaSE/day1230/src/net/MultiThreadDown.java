package net;

public class MultiThreadDown {
	public static void main(String[] args) throws Exception {
		//��ʼ��DownUtile����
		final DownUtil downUtil = new DownUtil("http://www.crazyit.org/"
		+"attachment.php?aid=MTYONXxjNjBiYzNjN3wxMzElNTQ2MjU5fGNhO"
				+ "DlKVmpXVmhpNGlkWmVzR2JZbnluZWpqSllOd3JzckdodXJOMUpOWWtOaTJz"
		, "oraclesql", 4);
		//��ʼ����
		downUtil.download();
		new Thread(){
			public void run() {
				while (downUtil.getCompleteRate()<1) {
					//ÿ��0.1���ѯһ���������ɽ���
					//GUI�����пɸ��ݸĽ��������ƽ�����
					System.out.println("����ɣ�" + downUtil.getCompleteRate());
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
