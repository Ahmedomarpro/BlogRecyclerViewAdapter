package com.ao.kotlinrecyclerview

import com.ao.kotlinrecyclerview.model.BlogPost
import java.util.*

class DataSource {

    companion object {
        fun createDataSet(): ArrayList<BlogPost> {
            val list = ArrayList<BlogPost>()

            list.add(
                BlogPost(
                    "Time to Build a Kotlin App!",
                    "The REST API course is complete. You can find the videos here: https://codingwithmitch.com/courses/build-a-rest-api/.",
                    "https://lh3.googleusercontent.com/B1MLqGqDppGlrTt4Mgc0RUdy3d8ulUQgWl4mLOW4Hv_jKykUgaL_ixlH-ngRzfy5KA84pv7fqOCIuYsk0CcVwcQ5a4nUiyUOKwMjjD5TPIrUxb_oACcxBBM6SjGTKST-l2Xu0HFAFnjGrRNGPkK_a8vhDmEh9_zmhD0gUgpwuiAv-tAGzrPwBgXPDjeDQh84CcScfm1IDySyHKY1vuE4GFHWf1lLA12MA3goC1-02hYbGbrUmjtc1MHkoV8gLr5_l-OwJOH_wcvwXzzH3dfkHavTtetTWDxSgHfeYpJxH1HVt-SLjq1C7rIE6dA6WowsSUfxtO8rAxuQT1Fzq6q9XAvVUs8PipyHyIggV3rMTS4iDFKo6y8K7-WxPITQV9E-fAFHfDuwP1mGOt9ChfOOCklqylcPjNKOS2lk8CWUsHUi9IwjNN1IcoPuiSKUo2b-quMZFLbCg_yjcby7BOpZUqtk3RRBvMt0KcOE7cbVCiAuAURvTPBt3Oj0KL_zP-8eBgvVoaX3bEPT10ZcJ3z3JMxFotd2BJbwUcSRQajTxMNGOn3fzOdl7dyAaPKdN0cDrEcWBEZyH4VuGuJ7uQwNtzCoCbYqnPRksgslKytygeQ_ll5UUIuj_1O12q13E6k-txl45IWapNjIo-M2vVU8HoXhsjxDP1UDr7_dP7IlcmwBgiJg8T0hxz6Q77I6Qv5A9H792rZRHnCT5gtey-cLtoboWr0GH4_OE4e6AF4Sl1__qZ_kkbKHPfc=w757-h1008-no",
                    "Ahmed OMAR"
                )
            )


            list.add(
                BlogPost(
                    "Congratulations!",
                    "You made it to the end of the course!\r\n\r\nNext we'll be building the REST API!",
                     "https://render.fineartamerica.com/images/rendered/default/greeting-card/images/artworkimages/medium/1/good-viwe-of-nature-club-wanvisa-klawklean.jpg?&targetx=0&targety=-10&imagewidth=700&imageheight=521&modelwidth=700&modelheight=500&backgroundcolor=0B301A&orientation=0",
                    "WWWoooo"
                )
            )
            list.add(
                BlogPost(
                    "Time to Build a Kotlin App!",
                    "The REST API course is complete. You can find the videos here: https://codingwithmitch.com/courses/build-a-rest-api/.",
                    "https://photos.app.goo.gl/N1zMnLeC73HkAY6P8",
                    "mitch"
                )
            )

            list.add(
                BlogPost(
                    "Interviewing a Web Developer and YouTuber",
                    "Justin has been producing online courses for YouTube, Udemy, and his website CodingForEntrepreneurs.com for over 5 years.",
                    "https://lh3.googleusercontent.com/B1MLqGqDppGlrTt4Mgc0RUdy3d8ulUQgWl4mLOW4Hv_jKykUgaL_ixlH-ngRzfy5KA84pv7fqOCIuYsk0CcVwcQ5a4nUiyUOKwMjjD5TPIrUxb_oACcxBBM6SjGTKST-l2Xu0HFAFnjGrRNGPkK_a8vhDmEh9_zmhD0gUgpwuiAv-tAGzrPwBgXPDjeDQh84CcScfm1IDySyHKY1vuE4GFHWf1lLA12MA3goC1-02hYbGbrUmjtc1MHkoV8gLr5_l-OwJOH_wcvwXzzH3dfkHavTtetTWDxSgHfeYpJxH1HVt-SLjq1C7rIE6dA6WowsSUfxtO8rAxuQT1Fzq6q9XAvVUs8PipyHyIggV3rMTS4iDFKo6y8K7-WxPITQV9E-fAFHfDuwP1mGOt9ChfOOCklqylcPjNKOS2lk8CWUsHUi9IwjNN1IcoPuiSKUo2b-quMZFLbCg_yjcby7BOpZUqtk3RRBvMt0KcOE7cbVCiAuAURvTPBt3Oj0KL_zP-8eBgvVoaX3bEPT10ZcJ3z3JMxFotd2BJbwUcSRQajTxMNGOn3fzOdl7dyAaPKdN0cDrEcWBEZyH4VuGuJ7uQwNtzCoCbYqnPRksgslKytygeQ_ll5UUIuj_1O12q13E6k-txl45IWapNjIo-M2vVU8HoXhsjxDP1UDr7_dP7IlcmwBgiJg8T0hxz6Q77I6Qv5A9H792rZRHnCT5gtey-cLtoboWr0GH4_OE4e6AF4Sl1__qZ_kkbKHPfc=w757-h1008-no",
                    "John"
                )
            )
            list.add(
                BlogPost(
                    "Time to Build a Kotlin App!",
                    "The REST API course is complete. You can find the videos here: https://codingwithmitch.com/courses/build-a-rest-api/.",
                    "https://lh3.googleusercontent.com/B1MLqGqDppGlrTt4Mgc0RUdy3d8ulUQgWl4mLOW4Hv_jKykUgaL_ixlH-ngRzfy5KA84pv7fqOCIuYsk0CcVwcQ5a4nUiyUOKwMjjD5TPIrUxb_oACcxBBM6SjGTKST-l2Xu0HFAFnjGrRNGPkK_a8vhDmEh9_zmhD0gUgpwuiAv-tAGzrPwBgXPDjeDQh84CcScfm1IDySyHKY1vuE4GFHWf1lLA12MA3goC1-02hYbGbrUmjtc1MHkoV8gLr5_l-OwJOH_wcvwXzzH3dfkHavTtetTWDxSgHfeYpJxH1HVt-SLjq1C7rIE6dA6WowsSUfxtO8rAxuQT1Fzq6q9XAvVUs8PipyHyIggV3rMTS4iDFKo6y8K7-WxPITQV9E-fAFHfDuwP1mGOt9ChfOOCklqylcPjNKOS2lk8CWUsHUi9IwjNN1IcoPuiSKUo2b-quMZFLbCg_yjcby7BOpZUqtk3RRBvMt0KcOE7cbVCiAuAURvTPBt3Oj0KL_zP-8eBgvVoaX3bEPT10ZcJ3z3JMxFotd2BJbwUcSRQajTxMNGOn3fzOdl7dyAaPKdN0cDrEcWBEZyH4VuGuJ7uQwNtzCoCbYqnPRksgslKytygeQ_ll5UUIuj_1O12q13E6k-txl45IWapNjIo-M2vVU8HoXhsjxDP1UDr7_dP7IlcmwBgiJg8T0hxz6Q77I6Qv5A9H792rZRHnCT5gtey-cLtoboWr0GH4_OE4e6AF4Sl1__qZ_kkbKHPfc=w757-h1008-no",
                    "Ahmed OMAR"
                )
            )
            list.add(
                BlogPost(
                    "Time to Build a Kotlin App!",
                    "The REST API course is complete. You can find the videos here: https://codingwithmitch.com/courses/build-a-rest-api/.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSgxF6sLoqaPa-vOelWZiUVHj7JrxnrxoOHCEHTr0qwaNIrxUp_Mw&s",
                    "mitch"
                )
            )

            list.add(
                BlogPost(
                    "Time to Build a Kotlin App!",
                    "The REST API course is complete. You can find the videos here: https://codingwithmitch.com/courses/build-a-rest-api/.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSgxF6sLoqaPa-vOelWZiUVHj7JrxnrxoOHCEHTr0qwaNIrxUp_Mw&s",
                    "mitch"
                )
            )
            list.add(
                BlogPost(
                    "Time to Build a Kotlin App!",
                    "The REST API course is complete. You can find the videos here: https://codingwithmitch.com/courses/build-a-rest-api/.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSgxF6sLoqaPa-vOelWZiUVHj7JrxnrxoOHCEHTr0qwaNIrxUp_Mw&s",
                    "mitch"
                )
            )
            list.add(
                BlogPost(
                    "Time to Build a Kotlin App!",
                    "The REST API course is complete. You can find the videos here: https://codingwithmitch.com/courses/build-a-rest-api/.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSgxF6sLoqaPa-vOelWZiUVHj7JrxnrxoOHCEHTr0qwaNIrxUp_Mw&s",
                    "mitch"
                )
            )
            list.add(
                BlogPost(
                    "Time to Build a Kotlin App!",
                    "The REST API course is complete. You can find the videos here: https://codingwithmitch.com/courses/build-a-rest-api/.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSgxF6sLoqaPa-vOelWZiUVHj7JrxnrxoOHCEHTr0qwaNIrxUp_Mw&s",
                    "mitch"
                )
            )
            list.add(
                BlogPost(
                    "Javascript Expert - Wes Bos",
                    "Interviewing a web developer, javascript expert, entrepreneur, freelancer, podcaster, and much more.",
                    "https://i2-prod.mirror.co.uk/incoming/article20725030.ece/ALTERNATES/s1200b/0_EMB-PREMIUM-EXCLUSIVE-Adele-is-seen-looking-slim-and-athletic-at-Drake-birthday-party-celebration.jpg",
                    "Ruby"
                )
            )
            list.add(
                BlogPost(
                    "Senior Android Engineer - Kaushik Gopal",
                    "Kaushik Gopal is a Senior Android Engineer working in Silicon Valley.\r\n\r\nHe works as a Senior Staff engineer at Instacart.\r\n\r\nInstacart: https://www.instacart.com/",
                    "https://akns-images.eonline.com/eol_images/Entire_Site/2018024/rs_1024x759-180124143107-1024-Adele-Grammy-Awards-Green-Dress.jpg?fit=inside|900:auto&output-quality=90",
                    "mitch"
                )
            )













            return list
        }
    }
}