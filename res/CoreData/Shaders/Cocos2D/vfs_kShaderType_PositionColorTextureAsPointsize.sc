�GSN    �˅1��\7,5V'Y 6Nh &[7��H�ah�,yQ�Ű?s@Ł����'��v�y8�h9(/�}R2Q���wt�yu����.C�7�!�՜߁xɜ��rc�Fw�]o�f�fl���qGI��[H$�[&�\%�0�Pjܞ��b�0Mơ<£���X����#,����SA�7��ُt*0��Ai<�vl譨ʆݟ%����:��{o'��������K�X1e�ԥԚ�&jN����]�+ad�ଇ��(|��,B��r�Ew�8��씓Y��g�~��̑_븀�R�J�E�E
ŐYEh��n�h�^-�����jg�$���	�k[�Nz�@��*o���A�$�S����'�s�w��߱RϹ��5,���/h�y^�*�L�����v���"���;��R*-E��G��X�|�:���%,��8�GU"��ٵ��a���8����qޫ�N8���d:~�&�5+?�s�|[0s t�����jl(u_viewProjMatrix,CC_MVMatrix) , vec4(a_position.xyz,1.0));
    //gl_PointSize = a_texcoord0.x;
    v_fragmentColor = vec4(a�color0.rgb * a_color0.a * u_alpha.x, a_color0.a * u_alpha.x);
}


#endif

#ifdef FS
$input v_fragmentColor


#includes"../Library/Base/common.sh"


uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uni�orm mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vc4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;


void main()
{
    gl_FragColor = v_fragmentColor;
}c


#endif
