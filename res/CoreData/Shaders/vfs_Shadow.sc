�GSN    �˅1��\7,5V'pcU42{)��N��&0���WCf䴱�e�*���]m�yi�xLk2�CF9+���L$v�� ?�֣W�H;�KWp�f����P����9NS�zH�cI��@C���QK�W�7K"�	�U�(�Ld��ލ�.�sR5��A}������5����*��~��Ut��˾�:Ybq��l~�,/Ǜ���8��V���pod��������Qp�.qpv�ǁ��B��͂U�\g:#[	������?r΃l��QK�mD^�Z��듔ZN��y�(�گ� |�ꀄ z�J��'��VOk��#�S|gH�iN?�[�V����k}�?���Q�(D�<�:�qFi:����m�P����4M�sg�%k����K����9Pn\ƠB�yS+�w-�x������S[߿7�V>���x��[$6S��]��e�J��t���;._ޠ=�qV��nם��z�ۥZ����C�²yA��ʸ?C3~�&J�:�a�mV	tE>ٛ���IB;
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * u;
   v =  t1 + (t3 - t1) * v;

   //gl_Position.x = u *�2.0 - 1.0;
   //gl_Position.y = v * 2.0 - 1.0;

   v_position = gl_Position;
}

#endif


/// Frag shader
#ifdef FS
Y#define USING_INOUT_POSITION
#include "Library/Varying.glsl"


#include "Library/Common.glsl"

void main()
{
    //floa� depth = v_position.z / v_position.w * 0.5 + 0.5;
    //gl_FragColor = vec4(EncodeDepth(depth),1.0);
    gl_FragColor = vec4_	plat(0);
}

#endif
