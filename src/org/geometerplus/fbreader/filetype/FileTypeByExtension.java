/*
 * Copyright (C) 2012 Geometer Plus <contact@geometerplus.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

package org.geometerplus.fbreader.filetype;

import org.geometerplus.zlibrary.core.filesystem.ZLFile;
import org.geometerplus.zlibrary.core.util.MimeType;

class FileTypeByExtension extends FileType {
	private final String myExtension;
	private final MimeType myMimeType;

	FileTypeByExtension(String id, String extension, MimeType mimeType) {
		super(id);
		myExtension = extension;
		myMimeType = mimeType;
	}

	@Override
	public boolean acceptsFile(ZLFile file) {
		return acceptsExtension(file.getExtension());
	}

	@Override
	public boolean acceptsExtension(String ext) {
		return myExtension.equalsIgnoreCase(ext);
	}

	@Override
	public String extension() {
		return myExtension;
	}

	@Override
	public MimeType mimeType() {
		return myMimeType;
	}
}
