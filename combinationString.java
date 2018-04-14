public static void combinationString() {
		final String csv_file_name = System.getProperty("user.home") + "\\Desktop\\discover_a_demon_witchwood_standard.csv";
		final int numofDiscover = 3;
		final int numofCombinations = 1540;
		String[] demons = {"Voidlord", "Doomguard", "Blood Imp", "Flame Imp", "Voidwalker", "Witchwood Imp", "Succubus", "Vulgar Homunculus",
				"Felguard", "Howlfiend", "Void Terror", "Hooked Reaver", "Lakkari Felhound", "Pit Lord", "Despicable Dreadlord",
				"Dread Infernal", "Lord Jaraxxus",  "Nightmare Amalgam", "Void Ripper", "Felsoul Inquisitor", "Sneaky Devil", "Illidan Stormrage"};
		String[][] discover = new String[numofCombinations][numofDiscover];
		int count = 0;
		int y = 0;
		for(int i = 0; i < demons.length; i++) {
			for(int j = i + 1; j < demons.length; j++) {
				for(int k = j + 1; k < demons.length; k++) {
					discover[count][y++] = demons[i];
					discover[count][y++] = demons[j];
					discover[count][y] = demons[k];
					count++;
					y = 0;
				}
			}
		}
		count = 1;
		try {
			FileWriter writer = new FileWriter(csv_file_name, true);
			for(int i = 0; i < numofCombinations; i++) {
				for(int j = 0; j < numofDiscover - 1; j++) {
					writer.append(discover[i][j] + ',');
				}
				writer.append(discover[i][2] + '\n');
				count++;
			}
			writer.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
}
