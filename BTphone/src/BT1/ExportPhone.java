package BT1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExportPhone {

	abstract class SetPhone {
		// this is abstract class
		public abstract void InsertPhone(String name, int Phone);

		public abstract void RemovePhone(String name);

		public abstract void UpdatePhone(String name, String NewPhone);

		public abstract void SearchPhone(String name);

		public abstract void Sort();
	}

	class Phone extends SetPhone {

		List<NamePhone> listName = new ArrayList<NamePhone>();

		@Override
		public void InsertPhone(String name, int phone) {
			// TODO Auto-generated method stub
				NamePhone object = new NamePhone();
				object.setName(name);
				object.setNumber(phone);
				listName.add(object);
		}

		public void showContacts() {
			for(int i = 0; i < listName.size(); i++) {
				System.out.println("Name: " + listName.get(i).getName() + 
						" and Phone: " + listName.get(i).getNumber());
			}
		}
		
		@Override
		public void RemovePhone(String name) {
			// TODO Auto-generated method stub
			System.out.println("List name before remove: " + listName.size());
			for(int i = 0; i <= listName.size(); i++) {
				if(listName.get(i).getName().equals(name)) {
					System.out.println(listName.get(i));
					listName.remove(listName.get(i));				
				}
			}
			System.out.println("The name phone " + name +
					" in contact has already remove !!!! ");
			System.out.println("List name after remove: " + listName.size());
		}

		@Override
		public void UpdatePhone(String name, String NewPhone) {
			// TODO Auto-generated method stub

		}

		@Override
		public void SearchPhone(String name) {
			// TODO Auto-generated method stub

		}

		@Override
		public void Sort() {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		ExportPhone exp = new ExportPhone();
		ExportPhone.Phone phoneNumber = exp.new Phone();
		String name;
		int phone;
		int i = 0;
		while (i < 2) {
			System.out.println("Input name: " );
			name = sc.next();
			System.out.println("Input phone: ");
			phone = sc.nextInt();
			phoneNumber.InsertPhone(name, phone);
		  i++;
		}
		System.out.print("Input name need remove from contact: ");
		String nameRemove = sc.next();
		phoneNumber.RemovePhone(nameRemove);
		phoneNumber.showContacts();
	}
}
