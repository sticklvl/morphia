/**
 * Copyright (C) 2010 Olafur Gauti Gudmundsson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.mongodb.morphia.testdaos;


import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.testmodel.Hotel;
import com.mongodb.Mongo;


/**
 * @author Olafur Gauti Gudmundsson
 */
public class HotelDAO extends BasicDAO<Hotel, String> {

  public HotelDAO(final Morphia morphia, final Mongo mongo) {
    super(mongo, morphia, "morphia_test");
  }
}
