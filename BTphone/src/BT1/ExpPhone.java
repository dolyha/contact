//package BT1;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Scanner;
//
//public class ExpPhone {
//
//	abstract class SetPhone {
//		public abstract void InsertPhone(String name, String Phone);
//
//		public abstract void RemovePhone(String name);
//
//		public abstract void UpdatePhone(String name, String NewPhone);
//
//		public abstract void SearchPhone(String name);
//
//		public abstract void Sort();
//	}
//
//	class Phone extends SetPhone {
//
//		List<NamePhone> phoneList = new ArrayList<>();
//		NamePhone namePhone = null;
//		Scanner sc = new Scanner(System.in);
//
//		@Override
//		public void InsertPhone(String name, String Phone) {
//			// TODO Auto-generated method stub
//			// List a = {{a; b}, {b; c}};
//			int kt1 = 0;
//			int kt2 = 0;
//			for (NamePhone ojb : phoneList) {
//				if (namePhone.getName().equals(name)) {
//
//					int[] listPhoneNumber = namePhone.getNumber().split("\\s:\\s"); // cat chuoi trong so dien thoai
//
//					for (int s : listPhoneNumber) {
//
//						if (s.equals(Phone)) {
//
//							kt1 = 1;
//							break;
//
//						}
//					}
//
//					kt2 = 1;
//
//				}
//
//			}
//
//			if (kt1 == 1 && kt2 == 1) {
//
//				System.out.println("Nhap ten va sdt bi trung!");
//
//			} else if (kt1 == 0 && kt2 == 0) {
//
//				this.namePhone = new NamePhone(name, Phone);
//				phoneList.add(namePhone);
//
//			} else if (kt2 == 1 && kt1 == 0) {
//
//				namePhone.setNumber(namePhone.getNumber() + " : " + Phone);
//			}
//
//		}
//
//		@Override
//		public void RemovePhone(String name) {
//			// TODO Auto-generated method stub
//			for (NamePhone list : phoneList) {
//
//				if (namePhone.getName().equals(name)) {
//					System.out.println("CC");
////					list.
//				}
//			}
//
//		}
//
//		@Override
//		public void UpdatePhone(String name, String NewPhone) {
//			// TODO Auto-generated method stub
//
//		}
//
//		@Override
//		public void SearchPhone(String name) {
//			// TODO Auto-generated method stub
//
//		}
//
//		@Override
//		public void Sort() {
//			// TODO Auto-generated method stub
//
//		}
//
//		void showListPhone() {
//			for (NamePhone namePhone : phoneList) {
//				System.out.println("Name : " + namePhone.getName() + ", Phone: " + namePhone.getNumber());
//			}
//		}
//
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int choice = 0;
//		String name = null;
//		String phone = null;
//		ExpPhone abs = new ExpPhone();
//		Phone ph = abs.new Phone();
//
//		do {
//			System.out.println("Nhập các lựa chọn : ");
//			System.out.println("1. Insert Phone");
//			System.out.println("2. Remove Phone");
//			System.out.println("3. Update Phone");
//			System.out.println("4. Search Phone");
//			System.out.println("5. Sort");
//			System.out.println("6. Exit");
//			choice = sc.nextInt();
//			sc.nextLine();
//			switch (choice) {
//			case 1:
//				System.out.println("Nhập tên: ");
//				name = sc.nextLine();
//				System.out.println("Nhập sdt: ");
//				phone = sc.nextLine();
//				ph.InsertPhone(name, phone);
//				ph.showListPhone();
//				break;
//			case 2:
//				System.out.println("Nhập tên: ");
//				name = sc.nextLine();
//				ph.RemovePhone(name);
//				ph.showListPhone();
//				break;
//			case 3:
//				System.out.println("Nhập tên: ");
//				name = sc.nextLine();
//				System.out.println("Nhập sdt mới: ");
//				phone = sc.nextLine();
//				ph.UpdatePhone(name, phone);
//				ph.showListPhone();
//				break;
//			case 4:
//				System.out.println("Nhập tên: ");
//				name = sc.nextLine();
//				ph.SearchPhone(name);
//				break;
//			case 5:
//				System.out.println("Sắp xếp theo bảng chữ cái: ");
//				ph.Sort();
//				ph.showListPhone();
//				break;
//			case 6:
//				break;
//			default:
//				break;
//			}
//		} while (choice != 6);
//	}
//
//}
