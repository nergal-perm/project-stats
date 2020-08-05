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

/*
 * @todo #1:1h Create stubs for DataSourceRepository and DataSource
 */
/**
 * Interface for {@link DataSource} repository used to cache requests and data
 * for a single report.
 * @since 1.0
 */
public interface DataSourceRepository {
    /**
     * Adds a new {@link DataSource} object to a repository.
     * @param key Locally unique data source identifier.
     * @param source Object to store in repository.
     */
    void add(String key, DataSource source);

    /**
     * Gets previously stored {@link DataSource} object from repository.
     * @param key Locally unique data source identifier.
     * @return Previously stored {@link DataSource} object.
     */
    DataSource source(String key);
}
