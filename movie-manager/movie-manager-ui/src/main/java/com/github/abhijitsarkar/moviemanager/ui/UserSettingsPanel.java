/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UserSettingsPanel.java
 *
 * Created on Nov 9, 2011, 6:53:27 PM
 */
package com.github.abhijitsarkar.moviemanager.ui;

import static com.github.abhijitsarkar.moviemanager.ui.util.UIUtil.createImageIcon;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import com.github.abhijitsarkar.moviemanager.ui.util.ConfigManager;
import com.github.abhijitsarkar.moviemanager.ui.util.Image;

/**
 * 
 * @author abhijit
 */
public class UserSettingsPanel extends javax.swing.JPanel {

	private static final long serialVersionUID = 7411785757210399566L;

	/** Creates new form UserSettingsPanel */
	public UserSettingsPanel(Window w) {
		this.w = w;

		initComponents();

		try {
			Properties prop = ConfigManager.getConfigProperties();
			String userSettingsIO = prop
					.getProperty(ConfigManager.USER_SETTINGS_IO_KEY);

			if (ConfigManager.USER_SETTINGS_IO_NO_PREF_VALUE
					.equals(userSettingsIO)) {
				noPreferenceRadioButton.setSelected(true);
			} else if (ConfigManager.USER_SETTINGS_IO_START_WITH_VALUE
					.equals(userSettingsIO)) {
				alwaysStartWithRadioButton.setSelected(true);

				alwaysStartWithField
						.setText(prop
								.getProperty(ConfigManager.USER_SETTINGS_IO_START_WITH_KEY));
			} else {
				rememberLastRadioButton.setSelected(true);
			}
		} catch (IOException ex) {
			ex.printStackTrace();

			JOptionPane.showMessageDialog(null,
					"Could not retrieve user preferences.", "Warning",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		fileChooser = new javax.swing.JFileChooser();
		inputOutputRadioButtonGroup = new javax.swing.ButtonGroup();
		inputOutputLabel = new javax.swing.JLabel();
		noPreferenceRadioButton = new javax.swing.JRadioButton();
		rememberLastRadioButton = new javax.swing.JRadioButton();
		alwaysStartWithRadioButton = new javax.swing.JRadioButton();
		alwaysStartWithField = new javax.swing.JTextField(30);
		browseButton = new javax.swing.JButton(createImageIcon(Image.BROWSE));
		closeButton = new javax.swing.JButton(createImageIcon(Image.CLOSE));
		saveButton = new javax.swing.JButton(createImageIcon(Image.SAVE));

		inputOutputRadioButtonGroup.add(noPreferenceRadioButton);
		inputOutputRadioButtonGroup.add(rememberLastRadioButton);
		inputOutputRadioButtonGroup.add(alwaysStartWithRadioButton);

		inputOutputLabel
				.setText("Input & Output directory (requires restart):");

		noPreferenceRadioButton.setText("No preference");

		rememberLastRadioButton.setSelected(true);
		rememberLastRadioButton.setText("Remember last opened");

		alwaysStartWithRadioButton.setText("Always start with:");
		alwaysStartWithRadioButton
				.addItemListener(new java.awt.event.ItemListener() {
					public void itemStateChanged(java.awt.event.ItemEvent evt) {
						alwaysStartWithRadioButtonItemStateChanged(evt);
					}
				});

		alwaysStartWithField.setEnabled(false);

		browseButton.setText("Browse");
		browseButton.setEnabled(false);
		browseButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				browseButtonActionPerformed(evt);
			}
		});

		closeButton.setText("Close");
		closeButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				closeButtonActionPerformed(evt);
			}
		});

		saveButton.setText("Save");
		saveButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				saveButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addComponent(inputOutputLabel)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(23, 23,
																		23)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addGroup(
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																								.addComponent(
																										rememberLastRadioButton)
																								.addComponent(
																										noPreferenceRadioButton,
																										javax.swing.GroupLayout.Alignment.LEADING)
																								.addComponent(
																										alwaysStartWithRadioButton,
																										javax.swing.GroupLayout.Alignment.LEADING))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																												.addComponent(
																														saveButton)
																												.addComponent(
																														alwaysStartWithField,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														279,
																														javax.swing.GroupLayout.PREFERRED_SIZE))
																								.addGap(18,
																										18,
																										18)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														closeButton)
																												.addComponent(
																														browseButton,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														115,
																														javax.swing.GroupLayout.PREFERRED_SIZE))))))
								.addContainerGap(26, Short.MAX_VALUE)));

		layout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
				new java.awt.Component[] { browseButton, closeButton,
						saveButton });

		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGap(21, 21, 21)
								.addComponent(inputOutputLabel)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(noPreferenceRadioButton)
								.addGap(12, 12, 12)
								.addComponent(rememberLastRadioButton)
								.addGap(12, 12, 12)
								.addComponent(alwaysStartWithRadioButton)
								.addGap(12, 12, 12)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(browseButton)
												.addComponent(
														alwaysStartWithField,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(closeButton)
												.addComponent(saveButton))
								.addContainerGap(21, Short.MAX_VALUE)));

		layout.linkSize(javax.swing.SwingConstants.VERTICAL,
				new java.awt.Component[] { alwaysStartWithField, browseButton });

	}// </editor-fold>//GEN-END:initComponents

	private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_browseButtonActionPerformed
		File alwaysStartWithDir = null;
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int returnVal = fileChooser.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			alwaysStartWithDir = fileChooser.getSelectedFile();

			alwaysStartWithField.setText(alwaysStartWithDir.getAbsolutePath());
		}
	}// GEN-LAST:event_browseButtonActionPerformed

	private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_saveButtonActionPerformed
		try {
			Properties prop = ConfigManager.getConfigProperties();

			if (noPreferenceRadioButton.isSelected()) {
				prop.put(ConfigManager.USER_SETTINGS_IO_KEY,
						ConfigManager.USER_SETTINGS_IO_NO_PREF_VALUE);
			} else if (alwaysStartWithRadioButton.isSelected()) {
				prop.put(ConfigManager.USER_SETTINGS_IO_KEY,
						ConfigManager.USER_SETTINGS_IO_START_WITH_VALUE);

				prop.put(ConfigManager.USER_SETTINGS_IO_START_WITH_KEY,
						alwaysStartWithField.getText());
			} else {
				prop.put(ConfigManager.USER_SETTINGS_IO_KEY,
						ConfigManager.USER_SETTINGS_IO_RMBR_LAST_VALUE);
			}

			ConfigManager.setConfigProperties(prop);
		} catch (IOException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(this,
					"Could not save user preferences.", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}// GEN-LAST:event_saveButtonActionPerformed

	private void alwaysStartWithRadioButtonItemStateChanged(
			java.awt.event.ItemEvent evt) {// GEN-FIRST:event_alwaysStartWithRadioButtonItemStateChanged
		if (((JRadioButton) evt.getItem()).isSelected()) {
			alwaysStartWithField.setEnabled(true);
			browseButton.setEnabled(true);
		} else {
			alwaysStartWithField.setEnabled(false);
			browseButton.setEnabled(false);
		}
	}// GEN-LAST:event_alwaysStartWithRadioButtonItemStateChanged

	private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_closeButtonActionPerformed
		w.setVisible(false);
		w.dispose();
	}// GEN-LAST:event_closeButtonActionPerformed
		// Variables declaration - do not modify//GEN-BEGIN:variables

	private javax.swing.JTextField alwaysStartWithField;
	private javax.swing.JRadioButton alwaysStartWithRadioButton;
	private javax.swing.JButton browseButton;
	private javax.swing.JButton closeButton;
	private javax.swing.JFileChooser fileChooser;
	private javax.swing.JLabel inputOutputLabel;
	private javax.swing.ButtonGroup inputOutputRadioButtonGroup;
	private javax.swing.JRadioButton noPreferenceRadioButton;
	private javax.swing.JRadioButton rememberLastRadioButton;
	private javax.swing.JButton saveButton;
	// End of variables declaration//GEN-END:variables
	private Window w;
}
