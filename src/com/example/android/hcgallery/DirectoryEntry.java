



/* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.example.android.hcgallery;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;

public class DirectoryEntry {
   private String name;
   private int resID;
   private int resID1;

   public DirectoryEntry(String name, int resID, int resID1) {
	   this.name = name;
	   this.resID = resID;
	   }
	   public String getName() {
	   return name;
	   }
	   public String getString(Resources res) {
	   return res.getString(resID);
	   }
	   public Drawable getDrawable(Resources res1) {
	   return res1.getDrawable(resID1);
	   }
	   public Bitmap getBitmap(Resources res) {
	   return BitmapFactory.decodeResource(res, resID);
	   }
}























