package medicalapp;

import java.awt.Component;
import java.util.Vector;

import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

public class MyComboBox {

	public void setJComboBoxData(JComboBox cbx, String[][] data, int fields[]) {

		String[] ids = new String[data.length];
		String[] descriptions = new String[data.length];

		for (int i = 0; i < data.length; i++) {
			ids[i] = data[i][0];
			descriptions[i] = data[i][fields[0]] + " " + data[i][fields[1]] + " - " + data[i][fields[2]];
		}

		setJComboBoxData(cbx, ids, descriptions);

	}

	public void setJComboBoxData(JComboBox cbx, String[] ids, String[] descriptions) {

		Vector<Item> model = new Vector<>();
		for (int i = 0; i < ids.length; i++) {
			cbx.addItem(new Item(ids[i], descriptions[i]));
		}
	}

	class ItemRenderer extends BasicComboBoxRenderer
	{

		public Component getListCellRendererComponent(
				JList list, Object value, int index,
				boolean isSelected, boolean cellHasFocus)
		{

			super.getListCellRendererComponent(list, value, index,
					isSelected, cellHasFocus);

			if (value != null)
			{
				Item item = (Item) value;
				setText(item.getDescription().toUpperCase());
			}

			if (index == -1)
			{
				Item item = (Item) value;
				setText("" + item.getId());
			}

			return this;
		}
	}

	class Item
	{

		private String id;
		private String description;

		public Item(String id, String description)
		{

			this.id = id;
			this.description = description;
		}

		public String getId()
		{

			return id;
		}

		public String getDescription()
		{

			return description;
		}

		public String toString()
		{

			return description;
		}
	}

}
