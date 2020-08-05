/*
 * Copyright Eugene Terekhov.
 *
 * This file is part of code-stats.
 *
 * code-stats is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3
 * or any later version as published by the Free Software Foundation.
 *
 * code-stats is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with code-stats.  If not, see <https://www.gnu.org/licenses/>.
 */
package ru.terekhov.codestats;

/**
 * Interface to obtain data from external data sources.
 * @since 1.0
 */
public interface DataSource {
    /**
     * Get string representation of a single data item.
     * @param key Requested data item's key inside the data source.
     * @return String representation of requested data item.
     */
    String getParsedValue(String key);
}
