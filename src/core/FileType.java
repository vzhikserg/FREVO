/*
 * Copyright (C) 2009 Istvan Fehervari, Wilfried Elmenreich
 * Original project page: http://www.frevotool.tk
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License Version 3 as published
 * by the Free Software Foundation http://www.gnu.org/licenses/gpl-3.0.txt
 *
 * There is no warranty for this free software. The GPL requires that 
 * modified versions be marked as changed, so that their problems will
 * not be attributed erroneously to authors of previous versions.
 */
package core;

/** Describes a file type along with its file extension. Mostly used in export functions. */
public class FileType {
	
	/** The file extension like "exe" or "txt" without the separator (.) character. */
	private String extension;
	
	/** A short description to display in save/load dialog boxes */
	private String description;

	/** Constructs a new <tt>FileType<tt> instance.
	 * @param extension The file extension used.
	 * @param description A short description about this file type.*/
	public FileType(String extension, String description) {
		this.extension = extension;
		this.description = description;
	}

	/**
	 * Returns the File extension associated with this file type without the leading period character.
	 * @return the file extension
	 */
	public String getExtension() {
		return extension;
	}

	/** Sets the file extension of this file type. The leading separator character will be omitted if present.
	 * @param extension the extension to be set
	 */
	public void setExtension(String extension) {
		if (extension.charAt(0) == '.')
			this.extension = extension.substring(1);
		else this.extension = extension;
	}

	/** Returns a short description of this file type
	 * @return a short description of this file type
	 */
	public String getDescription() {
		return description;
	}

	/** Sets a short description of this file type
	 * @param description a short description to be used
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
