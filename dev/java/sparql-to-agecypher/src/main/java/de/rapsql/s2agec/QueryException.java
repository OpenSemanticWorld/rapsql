/* 
   Copyright 2023 Andreas Räder

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package de.rapsql.s2agec;

public class QueryException extends Exception {
	// enables detection of unsupported query patterns
	// in SparqlAlgebraVisit.java
	public QueryException(String string) {
		super(string);
	}
}