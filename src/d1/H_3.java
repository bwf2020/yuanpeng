package d1;

import java.io.File;

public class H_3{
	
	public static void deleteFiles(File file) {
	 //�жϴ��ļ��Ƿ����
	 if(file.exists()) {
		 //�ж��Ƿ����ļ���
		 if(file.isDirectory()) {
			 
			 File[] files = file.listFiles();
			 //�ж��ļ��������Ƿ����ļ�
			 if(files.length >= 1) {
				 for (File file2 : files) {
					if(file2.isFile()) {
						//�ж����ļ���ֱ��ɾ��
						file2.delete();
					}else {
						//���ļ��оͼ����ݹ�ɾ��
						deleteFiles(file2);
					}
				}
				 //��ʱ�ļ���Ϊ�� ֱ��ɾ��
				 file.delete();
			 }else {
				 file.delete();
			 }
			 
		 }else {
			 //�����ļ���  �����ļ� ֱ��ɾ��
			 file.delete();
		 }
	 }else {
		 //�ļ�������
		 System.out.println("�ļ�������");
	 }
 }
	public static void main(String[] args){
	 File file = new File("c:/file");
	 deleteFiles(file);
	 }
 }



