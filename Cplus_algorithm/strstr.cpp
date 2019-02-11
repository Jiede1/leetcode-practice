#include <iostream>

using namespace std;

//实现在字符串中寻找子串，返回子串在字符串中出现的初始位置，若没有则返回null

char *strstr(const char *haystack, const char *needle) {
        // if needle is empty return the full string
        if (!*needle)
            return (char*) haystack;
        const char *p1;
        const char *p2;
        const char *p1_advance = haystack;
        for (p2 = &needle[1]; *p2; ++p2) {
                cout<<"hello"<<endl;
                p1_advance++; // advance p1_advance M-1 times
        }
        cout<<p1_advance<<endl;
        int k=0;
        for (p1 = haystack; *p1_advance; p1_advance++) {
            cout<<k<<endl;
            k++;
            cout<<"hello: "<<*p1_advance<<endl;
            char *p1_old = (char*) p1;
            p2 = needle;
            while (*p1 && *p2 && *p1 == *p2) {
                    p1++; p2++;
            }
            if (!*p2)
                return p1_old;
            p1 = p1_old + 1;
        }
        return NULL;
    }

int main()
{
    const char *str = "acabe";
    const char *subStr  = "abcd";
    char *p = strstr(str,subStr);
    cout<<*p<<endl;
    return 0;

}
